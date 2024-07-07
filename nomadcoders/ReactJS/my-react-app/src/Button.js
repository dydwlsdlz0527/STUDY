import PropTypes from "prop-types";
import styles from "./Button.module.css";

function Button({text}){
    return <button className={styles.btn}>{text}</button>;
}

Button.propTypes={
    text: PropTypes.string.isRequired
}

//외부에서 호출할 수 있도록 한다.
export default Button;