This is the implementation of the case given in the original at Hexagonal architecture the original 2005
article https://alistair.cockburn.us/hexagonal-architecture.

I just try to understand the exact code structure by looking at the package and import statements in sample code of the
paper, which are not complete. For example code has repository package for RateRepository and MockRateRepository, which is kind of against
what is presented in the paper. MockRepository should be outside the hexagon. Or we don't know the package of the test
so I created a test package for TestDiscounter.