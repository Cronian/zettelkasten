import { useState, useCallback } from "react";
import { MdAdd } from 'react-icons/md';
import "./MemoInsert.scss"

const MemoInsert = ({ onInsert }) => {
    const [value, setValue] = useState('');

    const onChange = useCallback(e => {
        setValue(e.target.value);
    },[]);

    const onSubmit = useCallback(
        e => {
            onInsert(value);
            setValue('');
            e.preventDefault();
        },
        [onInsert, value],
    );

    return (
        <form className="MemoInsert" onSubmit={onSubmit}>
            <input
                placeholder="메모를 추가하세요"
                value={value}
                onChange={onChange}
            />
            <button type="submit">
                <MdAdd />
            </button>
        </form>
    );
};

export default MemoInsert;