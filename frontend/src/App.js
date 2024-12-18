import React, {useEffect, useState} from 'react';
import axios from "axios";

// App 컴포넌트
function App() {
  const [memos, setMemos] = useState([]);

    // DB에 저장된 api list를 가져온다.
    useEffect( () => {
            axios.get('/api/memo/list',{headers: {
                'Accept': 'application/json'
            }})
                .then(res => {
                    setMemos(res.data);
                    console.log(res.data);
                    console.log(res);
                })
                .catch(error => console.log(error))
        }
        , []);

  const addMemo = (memoText) => {
              axios.put('/api/memo/save',{text : memoText, title : Date.now()},{headers: {
                      'Accept': 'application/json'
                  }})
                  .catch(error => console.log(error))

    setMemos([...memos, { text: memoText, title: Date.now() }]);
  };


  return (
      <div className="app">
        <Header />
        <MemoForm addMemo={addMemo} />
        <MemoList memos={memos} />
      </div>
  );
}


// Header 컴포넌트
function Header() {
  return <h1>Memo Application</h1>;
}

// MemoForm 컴포넌트
function MemoForm({ addMemo }) {
  const [input, setInput] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    if (input) {
      addMemo(input);
      setInput('');
    }
  };

  return (
      <form onSubmit={handleSubmit}>
        <input
            type="text"
            value={input}
            onChange={(e) => setInput(e.target.value)}
            placeholder="Write a memo..."
        />
        <button type="submit">Add Memo</button>
      </form>
  );
}

// MemoList 컴포넌트
function MemoList({ memos }) {
  return (
      <ul>
        {memos.map((memo) => (
            <li key={memo.title}>{memo.text}</li>
        ))}
      </ul>
  );
}

export default App;