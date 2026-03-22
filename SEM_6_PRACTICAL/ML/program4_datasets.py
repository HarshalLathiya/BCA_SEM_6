from sklearn import datasets

# Load Iris dataset
iris = datasets.load_iris()
print("Iris Dataset")
print(iris.data[:5])   # first 5 rows
print(iris.target[:5])

# Load Wine dataset
wine = datasets.load_wine()
print("\nWine Dataset")
print(wine.data[:5])

# Load Digits dataset
digits = datasets.load_digits()
print("\nDigits Dataset")
print(digits.data[:5])
