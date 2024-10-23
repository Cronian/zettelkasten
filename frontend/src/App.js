import React, { useState } from 'react';

// App 컴포넌트
function App() {
  const [memos, setMemos] = useState([]);

  const addMemo = (memoText) => {
    setMemos([...memos, { text: memoText, id: Date.now() }]);
  };

  return (
      <div className="app">
        <Header />
        <MemoForm addMemo={addMemo} />
        <MemoList memos={memos} />
      </div>
  );
}
/*
function App() {
  const [hello, setHello] = useState('')

  useEffect(() => {
    axios.get('/api/hello')
        .then(response => setHello(response.data))
        .catch(error => console.log(error))
  }, []);
 */

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
            <li key={memo.id}>{memo.text}</li>
        ))}
      </ul>
  );
}

export default App;