/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSubjMatterRatingRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsSubjMatterRatingRequestMethod implements UdtMethod {
  private String method = null;
  private InvsSubjMatterRatingRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsSubjMatterRatingCreate method */
  public static final InvsSubjMatterRatingRequestMethod INVS_SUBJ_MATTER_RATING_CREATE = new InvsSubjMatterRatingRequestMethod("InvsSubjMatterRatingCreate");
  /** Variable representing the InvsSubjMatterRatingFind method */
  public static final InvsSubjMatterRatingRequestMethod INVS_SUBJ_MATTER_RATING_FIND = new InvsSubjMatterRatingRequestMethod("InvsSubjMatterRatingFind");
  /** Variable representing the InvsSubjMatterRatingGet method */
  public static final InvsSubjMatterRatingRequestMethod INVS_SUBJ_MATTER_RATING_GET = new InvsSubjMatterRatingRequestMethod("InvsSubjMatterRatingGet");
  /** Variable representing the InvsSubjMatterRatingUpdate method */
  public static final InvsSubjMatterRatingRequestMethod INVS_SUBJ_MATTER_RATING_UPDATE = new InvsSubjMatterRatingRequestMethod("InvsSubjMatterRatingUpdate");
}
