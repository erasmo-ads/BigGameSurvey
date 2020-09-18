import React, { useEffect } from 'react';
import axios from 'axios';
import './styles.css';

const BASE_URL = 'http://localhost:8080'

const Records = () => {
    
    useEffect(() => {
        axios.get('${BASE_URL}/records?linesPerPage=12')
            .then(response => console.log(response));
    }, []);

    return (
    <div className="page-container">
        <table className="records-table" cellPadding="0" cellSpacing="0">
            <thead>
                <tr>
                    <th>INSTANTE</th>
                    <th>NOME</th>
                    <th>IDADE</th>
                    <th>PLATAFORMA</th>
                    <th>GÊNERO</th>
                    <th>TÍTULO DO GAME</th>                
                </tr>
            </thead>
            <tbody>
                 <tr> 
                     <td>20/08/2020 13:45</td>
                     <td>Erasmo Bezerra</td>
                     <td>32</td>
                     <td>XBOX</td>
                     <td>Ação e Aventura</td>
                     <td>The Last Of Us</td>
                 </tr>
                 <tr> 
                     <td>20/08/2020 13:45</td>
                     <td>Erasmo Bezerra</td>
                     <td>32</td>
                     <td>XBOX</td>
                     <td>Ação e Aventura</td>
                     <td>The Last Of Us</td>
                 </tr>
            </tbody>
        </table>
 
    </div>
  
 );
} 

export default Records;