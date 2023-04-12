import './App.css'
import { Card } from './components/card/card';
import { FoodData } from './interface/foodData';

function App() {

  const data : FoodData[] = [];

  return (
    <div className="container">

      <h1>Tasks</h1>
      <div className="card-grid">
        {data.map(taskData => <Card content={taskData.content} image={taskData.image}/>)};
      </div>

    </div>
  )
}

export default App
