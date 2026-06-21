let time = 60;
let timer = null;
let sentence = "I am learning web development";

function startGame() {
    document.getElementById("sentence").innerText = sentence;
    document.getElementById("input").disabled = false;

    if (timer !== null) {
        clearInterval(timer);
    }

    time = 60;

    timer = setInterval(function () {
        document.getElementById("timer").innerText = "Time: " + time;
        time--;

        if (time < 0) {
            clearInterval(timer);
            document.getElementById("result").innerText = "Time Over!";
        }
    }, 1000);
}

function checkTyping() {
    let typed = document.getElementById("input").value;

    if (typed === sentence) {
        document.getElementById("result").innerText = "Correct!";
    } else {
        document.getElementById("result").innerText = "Wrong!";
    }
}