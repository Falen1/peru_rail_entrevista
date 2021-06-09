package PeruRail.entidad;

public class PriceEntity {

	private static String _dolaresAntes;
	private static String _dolaresDespues;

	public static String get_dolaresAntes() {
		return _dolaresAntes;
	}

	public static void set_dolaresAntes(String _dolaresAntes) {
		PriceEntity._dolaresAntes = _dolaresAntes;
	}

	public static String get_dolaresDespues() {
		return _dolaresDespues;
	}

	public static void set_dolaresDespues(String _dolaresDespues) {
		PriceEntity._dolaresDespues = _dolaresDespues;
	}


}
