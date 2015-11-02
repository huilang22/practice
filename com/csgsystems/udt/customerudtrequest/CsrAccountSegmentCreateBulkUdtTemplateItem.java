/*
 * Generated code DO NOT EDIT
 * Generated file: CsrAccountSegmentCreateBulkUdtTemplateItem.java
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
 * Class used to create a CsrAccountSegmentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrAccountSegmentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrAccountSegmentObjectData CASCreateIn;
/**
 *
 * Constructor to create a  CsrAccountSegmentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrAccountSegmentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrAccountSegmentObjectData CASCreateInIn) {
    super(id, context, "CsrAccountSegmentCreate");
    CASCreateIn = CASCreateInIn;
  }

  public void translateToMap() {
    if (CASCreateIn != null) {
      CASCreateIn.resetFlags(true, true);
      addInput("CsrAccountSegment", CsrAccountSegmentObjectHelper.toMap(CASCreateIn, new HashMap(), "CsrAccountSegment").get("CsrAccountSegment"));
    }
  }


/**
 *
 * Sets the CsrAccountSegment
 * @param CASCreateInIn Value of the CASCreateIn
 *
 */

  public void setCsrAccountSegment(CsrAccountSegmentObjectData CASCreateInIn) {
    CASCreateIn = CASCreateInIn;
  }

  public void translateFromMap() {
    CASCreateIn = CsrAccountSegmentObjectHelper.fromMap(inputMap, "CsrAccountSegment");
  }

/**
 *
 * Gets the CsrAccountSegment
 * @return Value of the CsrAccountSegment
 *
 */

  public CsrAccountSegmentObjectData getCsrAccountSegment( ) {
    return CASCreateIn;
  }

}
