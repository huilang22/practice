/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrAccountSegmentDeleteBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a CsrAccountSegmentDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrAccountSegmentDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrAccountSegmentObjectKeyData CASDeleteIn;
/**
 *
 * Constructor to create a  CsrAccountSegmentDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrAccountSegmentDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrAccountSegmentObjectKeyData CASDeleteInIn) {
    super(id, context, "CsrAccountSegmentDelete");
    CASDeleteIn = CASDeleteInIn;
  }

  public void translateToMap() {
    if (CASDeleteIn != null) {
      CASDeleteIn.resetFlags(true, true);
      addInput("CsrAccountSegment", CsrAccountSegmentObjectKeyHelper.toMap(CASDeleteIn, new HashMap(), "CsrAccountSegmentObjectKeyData").get("CsrAccountSegmentObjectKeyData"));
    }
  }


/**
 *
 * Sets the CsrAccountSegment
 * @param CASDeleteInIn Value of the CASDeleteIn
 *
 */

  public void setCsrAccountSegment(CsrAccountSegmentObjectKeyData CASDeleteInIn) {
    CASDeleteIn = CASDeleteInIn;
  }

  public void translateFromMap() {
    CASDeleteIn = CsrAccountSegmentObjectKeyHelper.fromMap(inputMap, "CsrAccountSegment");
  }

/**
 *
 * Gets the CsrAccountSegment
 * @return Value of the CsrAccountSegment
 *
 */

  public CsrAccountSegmentObjectKeyData getCsrAccountSegment( ) {
    return CASDeleteIn;
  }

}
