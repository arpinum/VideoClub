package fr.arpinum.kata.videoclub;

public enum TypePrix {
	ENFANTS {
		@Override
		public Prix nouveauPrix() {
			return new PrixEnfant();
		}
	},
	NORMAL {
		@Override
		public Prix nouveauPrix() {
			return new PrixNormal();
		}
	},
	NOUVEAUTE {
		@Override
		public Prix nouveauPrix() {
			return new PrixNouveaute();
		}
	};

	public abstract Prix nouveauPrix();
}