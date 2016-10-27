package logic;

import java.util.ArrayList;
import java.util.List;

import domain.Vaucher;

public class Filtrator {
	public static List<Vaucher> filter(List<Vaucher> vauchers, Filter filter) {
		List<Vaucher> result = new ArrayList<>();
		for(Vaucher vaucher : vauchers) {
			if(filter.isSatisfy(vaucher)) {
				result.add(vaucher);
			}
		}
		return result;
	}

	public static void filter(List<Vaucher> srcVauchers, Filter filter, List<Vaucher> destVauchers) {
		for(Vaucher vaucher : srcVauchers) {
			if(filter.isSatisfy(vaucher)) {
				destVauchers.add(vaucher);
			}
		}
	}

//	public static List<Vaucher> filter(List<Vaucher> srcVauchers, Filter filter, List<Vaucher> destVauchers) {
//		if(destVauchers == null) {
//			destVauchers = new ArrayList<>();
//		}
//		for(Vaucher vaucher : srcVauchers) {
//			if(filter.isSatisfy(vaucher)) {
//				destVauchers.add(vaucher);
//			}
//		}
//		return destVauchers;
//	}
}
