import './MemoTemplate.scss'

const MemoTemplate = ({ children }) => {
    return (
        <div className="MemoTemplate">
            <div className="app-title">메모 관리
            </div>
            <div className="content">{children}</div>
        </div>
    )
}

export default MemoTemplate;