import { useState } from "react";
import "./App.css";

function App() {

  const [spell, setSpell] = useState(null);
  const [history, setHistory] = useState([]);

  const castSpell = async () => {

    const response =
      await fetch(`${process.env.REACT_APP_API_URL}/api/cast`);

    const data = await response.json();

    setSpell(data);

    setHistory(prev => {
      const updated = [data, ...prev];
      return updated.slice(0, 5);
    });
  };

  return (
    <div className="container">

      <button
        className="roulette-button"
        onClick={castSpell}
      >
        🎰 CLICK ME
      </button>

      {spell && (
        <div className="result-card">

          <h2>
            {spell.emoji} {spell.spellName}
          </h2>

          <p>{spell.result}</p>

        </div>
      )}

      <div className="history">

        <h3>Last 5 Casts</h3>

        {history.map((item, index) => (
          <div key={index}>
            {item.emoji} {item.spellName}
          </div>
        ))}

      </div>

    </div>
  );
}

export default App;
