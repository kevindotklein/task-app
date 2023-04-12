import "./card.css";

interface CardProps{
    content: string,
    image: string
}

export function Card({content, image} : CardProps){
    return(
        <div className="card">
            <img />
            <p></p>
        </div>
    )
}