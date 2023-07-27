class Car:
    'This class represents a car'

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
    
    def accelerate(self):
        print(self.manufacturer + " " + self.model + " started to move")

    def stop(self):
        print(self.manufacturer + " " + self.model + " stoped moving!")


car1 = Car("Maruti", "Swift", "2021", "Manual", "Black")
car2 = Car("Ford", "Ecosport", "2022", "Manual", "Red")
car3 = Car("Skoda", "SuperB", "2020", "Manual", "Green")

car1.accelerate()
car1.stop()