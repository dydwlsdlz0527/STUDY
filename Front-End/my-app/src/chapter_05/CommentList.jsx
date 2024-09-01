import React from "react";
import Comment from "./Comment";

function CommentList(props) {
    return (
        <div>
            <Comment name={"abc"} comment={"안녕하세요."} />
        </div>
    );
}

export default CommentList;