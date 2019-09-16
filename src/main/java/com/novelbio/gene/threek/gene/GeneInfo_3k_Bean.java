package com.novelbio.gene.threek.gene;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Image;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id={geneID}", timeout = 60000, pipelines = "geneInfo_3k_Pipelines")
public class GeneInfo_3k_Bean implements HtmlBean{

	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(2) > table > tbody > tr > td:nth-child(1)")
	private String id;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(2) > table > tbody > tr > td:nth-child(2)")
	private String source;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(2) > table > tbody > tr > td:nth-child(3)")
	private String chrom;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(2) > table > tbody > tr > td:nth-child(4)")
	private String start;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(2) > table > tbody > tr > td:nth-child(5)")
	private String end;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(2) > table > tbody > tr > td:nth-child(6)")
	private String strand;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(2) > table > tbody > tr > td:nth-child(7)")
	private String cdsLen;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(2) > table > tbody > tr > td:nth-child(8)")
	private String exonNum;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(2) > table > tbody > tr > td:nth-child(9)")
	private String geneID;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(1) > td:nth-child(2)")
	private String coreGene;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(2) > td:nth-child(2)")
	private String ccoreGene;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(3) > td:nth-child(2)")
	private String distributed;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(4) > td:nth-child(2)")
	private String subsUnbalanced;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(5) > td:nth-child(2)")
	private String inDominant ;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(6) > td:nth-child(2)")
	private String japDominant ;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(7) > td:nth-child(2)")
	private String subSpecific ;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(8) > td:nth-child(2)")
	private String inSpecific ;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(9) > td:nth-child(2)")
	private String japSpecific ;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(10) > td:nth-child(2)")
	private String aus ;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(11) > td:nth-child(2)")
	private String aro ;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(12) > td:nth-child(2)")
	private String subgUnbalanced ;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(13) > td:nth-child(2)")
	private String inSubgroup ;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(14) > td:nth-child(2)")
	private String japSubgroup ;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(15) > td:nth-child(2)")
	private String random ;
	
	@Text
	@HtmlField(cssPath = "body > div.container > div:nth-child(3) > table > tbody > tr:nth-child(16) > td:nth-child(2) > a")
	private String age ;
	
	@Text
	@HtmlField(cssPath = "body > div.container > table > tbody > tr > td:nth-child(1)")
	private String geneFamily1 ;
	
	@Text
	@HtmlField(cssPath = "body > div.container > table > tbody > tr > td:nth-child(2)")
	private String geneFamily2 ;
	
	@Image(download = "/home/novelbio/桌面/Distribution")
	@HtmlField(cssPath = "#genetree > img")
	private String distribution;
	
	@Image(download = "/home/novelbio/桌面/PresenceFrequency1")
	@HtmlField(cssPath = "#heatmap1 > img")
	private String presence1;
	
	@Image(download = "/home/novelbio/桌面/PresenceFrequency2")
	@HtmlField(cssPath = "#heatmap2 > img")
	private String presence2;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getChrom() {
		return chrom;
	}

	public void setChrom(String chrom) {
		this.chrom = chrom;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getStrand() {
		return strand;
	}

	public void setStrand(String strand) {
		this.strand = strand;
	}

	public String getCdsLen() {
		return cdsLen;
	}

	public void setCdsLen(String cdsLen) {
		this.cdsLen = cdsLen;
	}

	public String getExonNum() {
		return exonNum;
	}

	public void setExonNum(String exonNum) {
		this.exonNum = exonNum;
	}

	public String getGeneID() {
		return geneID;
	}

	public void setGeneID(String geneID) {
		this.geneID = geneID;
	}

	public String getCoreGene() {
		return coreGene;
	}

	public void setCoreGene(String coreGene) {
		this.coreGene = coreGene;
	}

	public String getCcoreGene() {
		return ccoreGene;
	}

	public void setCcoreGene(String ccoreGene) {
		this.ccoreGene = ccoreGene;
	}

	public String getDistributed() {
		return distributed;
	}

	public void setDistributed(String distributed) {
		this.distributed = distributed;
	}

	public String getSubsUnbalanced() {
		return subsUnbalanced;
	}

	public void setSubsUnbalanced(String subsUnbalanced) {
		this.subsUnbalanced = subsUnbalanced;
	}

	public String getInDominant() {
		return inDominant;
	}

	public void setInDominant(String inDominant) {
		this.inDominant = inDominant;
	}

	public String getJapDominant() {
		return japDominant;
	}

	public void setJapDominant(String japDominant) {
		this.japDominant = japDominant;
	}

	public String getSubSpecific() {
		return subSpecific;
	}

	public void setSubSpecific(String subSpecific) {
		this.subSpecific = subSpecific;
	}

	public String getInSpecific() {
		return inSpecific;
	}

	public void setInSpecific(String inSpecific) {
		this.inSpecific = inSpecific;
	}

	public String getJapSpecific() {
		return japSpecific;
	}

	public void setJapSpecific(String japSpecific) {
		this.japSpecific = japSpecific;
	}

	public String getAus() {
		return aus;
	}

	public void setAus(String aus) {
		this.aus = aus;
	}

	public String getAro() {
		return aro;
	}

	public void setAro(String aro) {
		this.aro = aro;
	}

	public String getSubgUnbalanced() {
		return subgUnbalanced;
	}

	public void setSubgUnbalanced(String subgUnbalanced) {
		this.subgUnbalanced = subgUnbalanced;
	}

	public String getInSubgroup() {
		return inSubgroup;
	}

	public void setInSubgroup(String inSubgroup) {
		this.inSubgroup = inSubgroup;
	}

	public String getJapSubgroup() {
		return japSubgroup;
	}

	public void setJapSubgroup(String japSubgroup) {
		this.japSubgroup = japSubgroup;
	}

	public String getRandom() {
		return random;
	}

	public void setRandom(String random) {
		this.random = random;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGeneFamily1() {
		return geneFamily1;
	}

	public void setGeneFamily1(String geneFamily1) {
		this.geneFamily1 = geneFamily1;
	}

	public String getGeneFamily2() {
		return geneFamily2;
	}

	public void setGeneFamily2(String geneFamily2) {
		this.geneFamily2 = geneFamily2;
	}

	public String getDistribution() {
		return distribution;
	}

	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}

	public String getPresence1() {
		return presence1;
	}

	public void setPresence1(String presence1) {
		this.presence1 = presence1;
	}

	public String getPresence2() {
		return presence2;
	}

	public void setPresence2(String presence2) {
		this.presence2 = presence2;
	}
	
	
}
