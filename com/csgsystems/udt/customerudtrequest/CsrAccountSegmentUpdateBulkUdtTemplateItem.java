/*
 * Generated code DO NOT EDIT
 * Generated file: CsrAccountSegmentUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CsrAccountSegmentUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrAccountSegmentUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrAccountSegmentObjectData CASUpdateIn;
/**
 *
 * Constructor to create a  CsrAccountSegmentUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrAccountSegmentUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrAccountSegmentObjectData CASUpdateInIn) {
    super(id, context, "CsrAccountSegmentUpdate");
    CASUpdateIn = CASUpdateInIn;
  }

  public void translateToMap() {
    if (CASUpdateIn != null) {
      CASUpdateIn.resetFlags(true, true);
      addInput("CsrAccountSegment", CsrAccountSegmentObjectHelper.toMap(CASUpdateIn, new HashMap(), "CsrAccountSegment").get("CsrAccountSegment"));
    }
  }


/**
 *
 * Sets the CsrAccountSegment
 * @param CASUpdateInIn Value of the CASUpdateIn
 *
 */

  public void setCsrAccountSegment(CsrAccountSegmentObjectData CASUpdateInIn) {
    CASUpdateIn = CASUpdateInIn;
  }

  public void translateFromMap() {
    CASUpdateIn = CsrAccountSegmentObjectHelper.fromMap(inputMap, "CsrAccountSegment");
  }

/**
 *
 * Gets the CsrAccountSegment
 * @return Value of the CsrAccountSegment
 *
 */

  public CsrAccountSegmentObjectData getCsrAccountSegment( ) {
    return CASUpdateIn;
  }

}
