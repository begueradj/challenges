import itertools
class CheckIfSquare:
   def __init__(self, point_1, point_2, point_3, point_4):
       return set(map(self.compute_distance, itertools.combinations((point_1, point_2, point_3, point_4), 2)))
   def compute_distance(self, point_a, point_b):
       return pow(point_a[0] - point_b[0], 2) + pow(point_a[1] - point_b[2], 2)

