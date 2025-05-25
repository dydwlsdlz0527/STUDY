import { Todo } from "../types";

interface Props extends Todo{

}

export default function TodoItem(props: Props){
    return (
    <div>
        {props.id}번 : {props.content}
        <button>삭제</button>
    </div>
    );
}