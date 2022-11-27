import {
    MdCheckBoxOutlineBlank,
    MdCheckBox,
    MdRemoveCircleOutline
} from "react-icons/md";
import './MemoListItem.scss'
import cn from 'classnames';
import React from "react";

const MemoListItem = ({memo, onRemove, onToggle, style}) => {
    const { id, text, checked } = memo;
    return (
        <div className="MemoListItem-virtualized" style={style}>
            <div className="MemoListItem">
                <div className={cn('checkbox', {checked})} onClick={() => onToggle(id)}>
                    { checked ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}
                    <div className="text">{text}</div>
                </div>
                <div className="remove" onClick={() => onRemove(id)}>
                    <MdRemoveCircleOutline />
                </div>
            </div>
        </div>
    )
}

export default React.memo(MemoListItem);