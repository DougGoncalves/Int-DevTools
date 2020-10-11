import React, {useContext} from 'react'
import {DroneContext} from '../../utils/Context'
import {Col, Table, Alert} from 'reactstrap'

export default()=>{
    const [state] = useContext(DroneContext);
    const length = state.drones.length;
    const rows = state.drones.map((drone, index) => 
        <div key={index}>
          <iframe src={formatRastreamento(drone)} alt="mapa" height="200" width="300"></iframe>
        </div>
    )
    if (length > 0) {
        return (
            <Col md="8">
                <h3>Aonde está o seu drone ?</h3>
                 {rows}   
            </Col>
        )
    } else {
        return (
            <Col md="8">
                <h3>Onde está o seu drone ?</h3>
                <Alert color="info">Nenhum drone rastreado no momento.</Alert>
            </Col>
        )
    }
}

function formatRastreamento(drone) {
  if (drone.rastreamento) {
      return <a rel="noopener noreferrer" target="_blank" href={`https://www.google.com/maps/search/?api=1&query=${drone.latitude},${drone.longitude}`}>Ver</a>
  } else {
      return "-";
  }
}
