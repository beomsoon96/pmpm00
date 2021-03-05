package com.pickmepetme.service;

import java.util.List;

import com.pickmepetme.domain.ComunityVO;
import com.pickmepetme.domain.Criteria;

public interface ComunityService {
	
	
	// 리스트
	public List<ComunityVO> getList(Criteria cri);

	
	// 글 수 
	public int getTotal(Criteria cri);
	
	//수정
	public void update(ComunityVO vo) throws Exception;


	// 글 보기
	public ComunityVO pageview(int post_no);
	
	//삭제
	public void delete(int post_no) throws Exception;
	
	   //게시판 조회 +1
	public boolean comunityHit(int post_no) throws Exception;

	   //글삽입
	public void insertBoard(ComunityVO comunityvo);
	
/* 팁 게시판 인터페이스  */
	
	//팁커뮤니티 전체목록 조회
		public List<ComunityVO> tipgetList(Criteria cri);

		// 전체 글 수
		public int tipgetTotalCount(Criteria cri);

		//수정
		public void tipupdate(ComunityVO vo) throws Exception;
		
		// 글보기
		public ComunityVO tippageview(int post_no);
		
		//삭제
		public void tipdelete(int post_no) throws Exception;
		
		//게시판 조회 +1
		public boolean tipcomunityHit(int post_no) throws Exception;
		
		//글삽입
		public void tipinsertBoard(ComunityVO comunityvo);
	
		
		/* 돌봄 헬퍼게시판 인터페이스  */
		
		//돌봄헬퍼 커뮤니티 전체목록 조회
			public List<ComunityVO> caregetList(Criteria cri);

			// 전체 글 수
			public int caregetTotalCount(Criteria cri);

			//수정
			public void careupdate(ComunityVO vo) throws Exception;
			
			// 글보기
			public ComunityVO carepageview(int post_no);
			
			//삭제
			public void caredelete(int post_no) throws Exception;
			
			//게시판 조회 +1
			public boolean carecomunityHit(int post_no) throws Exception;
			
			//글삽입
			public void careinsertBoard(ComunityVO comunityvo);
			
			/* 돌봄 시터게시판 인터페이스  */
			
			//돌봄시터 커뮤니티 전체목록 조회
				public List<ComunityVO> sittergetList(Criteria cri);

				// 전체 글 수
				public int sittergetTotalCount(Criteria cri);

				//수정
				public void sitterupdate(ComunityVO vo) throws Exception;
				
				// 글보기
				public ComunityVO sitterpageview(int post_no);
				
				//삭제
				public void sitterdelete(int post_no) throws Exception;
				
				//게시판 조회 +1
				public boolean sittercomunityHit(int post_no) throws Exception;
				
				//글삽입
				public void sitterinsertBoard(ComunityVO comunityvo);
	
	
	
}
