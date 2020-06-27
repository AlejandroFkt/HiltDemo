package com.fortatic.hiltdemo.car

/**
 * Supongamos que esta clase no nos pertenece, por lo tanto no
 * podemos anotar su constructor con @Inject.
 * La única forma de hacer que Hilt sepa cómo crear instancias de
 * esta clase es con un módulo.
 *
 * @see com.fortatic.hiltdemo.di.TiresModule
 */
class Tires