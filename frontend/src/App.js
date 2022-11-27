import {useState, useRef, useCallback, useReducer} from "react";
import MemoTemplate from "./components/MemoTemplate";
import MemoInsert from "./components/MemoInsert";
import MemoList from "./components/MemoList";

function createBulkMemos() {
  const array = [];
  for (let i = 1; i <= 8 ; i++) {
    array.push({
      id: i,
      text: `메모 ${i}`,
      checked: false,
    });
  }
  return array;
}

function memoReducer(memos, action) {
  switch (action.type) {
    case 'INSERT':
      return memos.concat(action.memo);
    case 'REMOVE':
      return memos.filter(memo => memo.id !== action.id);
    case 'TOGGLE':
      return memos.map(memo =>
          memo.id === action.id ? { ...memo, checked: !memo.checked } : memo,
      );
    default:
      return memos;
  }
}

const App = () => {
  const [memos, dispatch] = useReducer(memoReducer, undefined, createBulkMemos);

  const onRemove = useCallback(
      id => {
        dispatch({ type: 'REMOVE', id})
      },[]
  );
  const onToggle = useCallback(
      id => {
        dispatch({ type: 'TOGGLE', id})
      },[]
  );

  const nextId = useRef(2501);

  const onInsert = useCallback(
      text => {
        const memo = {
          id: nextId.current,
          text,
          checked: false,
        };
        dispatch({ type: 'INSERT', memo});
        nextId.current += 1;
      }, []
  )

  return (
      <MemoTemplate>
        <MemoInsert onInsert={onInsert} />
        <MemoList memos={memos} onRemove={onRemove} onToggle={onToggle} />
      </MemoTemplate>
  );
};

export default App;