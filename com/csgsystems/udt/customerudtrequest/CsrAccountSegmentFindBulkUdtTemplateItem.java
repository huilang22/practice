/*
 * Generated code DO NOT EDIT
 * Generated file: CsrAccountSegmentFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a CsrAccountSegmentFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrAccountSegmentFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrAccountSegmentObjectFilter CASFindIn;
/**
 *
 * Constructor to create a  CsrAccountSegmentFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrAccountSegmentFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrAccountSegmentObjectFilter CASFindInIn) {
    super(id, context, "CsrAccountSegmentFind");
    CASFindIn = CASFindInIn;
  }

  public void translateToMap() {
    if (CASFindIn != null) {
      Integer index =  CASFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CsrAccountSegment", CsrAccountSegmentObjectHelper.toMap(CASFindIn, new HashMap(), "CsrAccountSegment").get("CsrAccountSegment"));
    }
  }


/**
 *
 * Sets the CsrAccountSegment
 * @param CASFindInIn Value of the CASFindIn
 *
 */

  public void setCsrAccountSegment(CsrAccountSegmentObjectFilter CASFindInIn) {
    CASFindIn = CASFindInIn;
  }

  public void translateFromMap() {
    CASFindIn = CsrAccountSegmentObjectHelper.fromMapFilter(inputMap, "CsrAccountSegment");
  }

/**
 *
 * Gets the CsrAccountSegment
 * @return Value of the CsrAccountSegment
 *
 */

  public CsrAccountSegmentObjectFilter getCsrAccountSegment( ) {
    return CASFindIn;
  }

}
