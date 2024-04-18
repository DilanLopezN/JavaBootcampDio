
class SalaExcedeNumeroPessoas extends Error {}

let listaSalas = [
  { id: 1, tipo: 'Sala de Reunião', capacidade: 10, reservas: [{ inicio: new Date('2024-04-11T10:00:00'), fim: new Date('2024-04-11T11:00:00') }] },
  { id: 1, tipo: 'Sala de Reunião', capacidade: 10, reservas: [{ inicio: new Date('2024-04-07T10:00:00'), fim: new Date('2024-04-09T11:00:00') }] },
  { id: 2, tipo: 'Sala de Conferências', capacidade: 20, reservas: [{ inicio: new Date('2024-04-12T14:00:00'), fim: new Date('2024-04-12T16:00:00') }] },
  { id: 3, tipo: 'Sala de Treinamento', capacidade: 15, reservas: [{ inicio: new Date('2024-04-13T09:00:00'), fim: new Date('2024-04-13T12:00:00') }] },
  { id: 4, tipo: 'Sala de Entrevistas', capacidade: 5, reservas: [] },
  { id: 5, tipo: 'Sala de Exposições', capacidade: 30, reservas: [{ inicio: new Date('2024-04-15T13:00:00'), fim: new Date('2024-04-15T18:00:00') }] }
];


function encontrarSalasDisponiveis(listaSalas, tipoSalaDesejado, numPessoas, inicioReserva, fimReserva) {
  
  if (listaSalas.length === 0) {
      return []; // Retorna uma lista vazia se não houver salas disponíveis
  }
  // Inicializar uma lista para armazenar as salas disponíveis
  let salasDisponiveis = [];

  listaSalas.map((salas, index) => {

      if(salas.tipo[index] === tipoSalaDesejado && salas.capacidade[index] < numPessoas) {
        throw new SalaExcedeNumeroPessoas("Existem salas disponiveis porém sem capacidade para lotação desejada!")
      }

      if(salas.tipo === tipoSalaDesejado && salas.capacidade >= numPessoas) {
        salasDisponiveis.push(salas);
      }
      

      salasDisponiveis[index]?.reservas?.map((data, index) => {
        if(inicioReserva >= data.inicio || inicioReserva < data.fim) {
          salasDisponiveis[index] = "Data de reserva excede datas disponiveis para esta sala!"
        }
      })


  })  

  return salasDisponiveis;
}
try {
let tipoSalaDesejado = 'Sala de Reunião';
let numPessoas = 8;
let inicioReserva = new Date('2024-04-11T13:00:00');
let fimReserva = new Date('2024-04-12T14:00:00');

const salasDisponiveis = encontrarSalasDisponiveis(listaSalas, tipoSalaDesejado, numPessoas, inicioReserva, fimReserva);
console.log("Salas disponíveis:", salasDisponiveis);
} catch (error) {
    console.log(error.message)
}


