import React, { useState } from 'react'
import Image from 'next/image'

const Item = ({ weight, url, setTotal, total }) => {
    const [count, setCount] = useState(0);

    const handleIncrement = () => {                                                                                
        setCount(() => count + 1);
        setTotal(total + weight);
    }

    const handleDecrement = () => {
        if (count > 0) {
            setCount(count - 1);
            setTotal(total - weight);
        }
    }

    


    return (
        <div class="d-flex flex-row mb-4 ps-2">
            <img src={url} alt="" width={100} height={80} />
            <div class="ms-3">
                <h5>{weight} lbs</h5>
                <div class="d-flex flex-row">
                    <button class="btn border rounded" onClick={handleDecrement}>
                        -
                    </button>
                    <h5 class="mt-3 mx-1">{count}</h5>
                    <button class="btn border rounded" onClick={handleIncrement}>
                        +
                    </button>
                </div>
            </div>

        </div>
    )
}

export default Item;
