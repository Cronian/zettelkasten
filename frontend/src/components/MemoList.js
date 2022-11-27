import MemoListItem from "./MemoListItem";
import { List } from 'react-virtualized';
import './MemoList.scss'
import React, {useCallback} from "react";

const MemoList = ({memos, onRemove, onToggle}) => {
    const rowRenderer = useCallback(
        ({ index, key, style}) => {
            const memo = memos[index];
            return (
                <MemoListItem
                    memo={memo}
                    key={key}
                    onRemove={onRemove}
                    onToggle={onToggle}
                    style={style}
                    />
            );
        },
        [onRemove, onToggle, memos]
    );

    return (
        <List
            className="MemoList"
            width={512}
            height={513}
            rowCount={memos.length}
            rowHeight={57}
            rowRenderer={rowRenderer}
            list={memos}
            style={{ outline: 'none' }}
            />
    );
};

export default React.memo(MemoList);