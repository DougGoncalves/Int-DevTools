import React, { useContext } from 'react'
import { DroneContext } from '../../utils/Context'
import { Col, Table, Alert } from 'reactstrap'
import '../List/list.css'

export default () => {
  const [state] = useContext(DroneContext);
  const length = state.drones.length;
  const rows = state.drones.map((drone, index) =>
    <tr key={index}>
      <td>{drone.idDrone}</td>
      <td>{drone.latitude}</td>
      <td>{drone.longitude}</td>
      <td>{drone.temperaturaAr}°C</td>
      <td>{drone.umidadeAr}%</td>
      <td>{formatRastreamento(drone)}</td>
    </tr>
  )
  if (length > 0) {
    return (
      <Col md="8">
        <h3 className="where">Onde seu drone está ?</h3>
        <Table dark hover>
          <thead>
            <tr>
              <td>Id Drone</td>
              <td>Latitude</td>
              <td>Longitude</td>
              <td>Temperatura Ar</td>
              <td>Umidade Ar</td>
              <td>Rastreamento</td>
            </tr>
          </thead>
          <tbody>
            {rows}
          </tbody>
        </Table>

      </Col>
    )
  } else {
    return (
      <Col md="8">
        <h3 className="where">Drones Rastreados</h3>
        <Alert color="warning">Nenhum drone rastreado no momento.</Alert>
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
