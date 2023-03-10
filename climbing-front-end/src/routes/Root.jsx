import React, { useState, useEffect } from 'react';

export default function Root() {

  const [wesTest, setWesTest] = useState([]);

  const handleClick = () => {
    fetch('http://localhost:8080/api/main-routes')
      .then(response => response.json())
      .then(data => { 
        setWesTest(data)
      })
      .catch(error => console.error(error));
  };
    console.log(wesTest); 
  return (
    <>
      <button onClick={() => handleClick()}>Fetch Data</button>
      <p>Result: {JSON.stringify(wesTest)}</p>
    </>
  );
}
