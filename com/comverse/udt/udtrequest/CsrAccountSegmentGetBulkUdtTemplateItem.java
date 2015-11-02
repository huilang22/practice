/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrAccountSegmentGetBulkUdtTemplateItem.java
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
 * Class used to create a CsrAccountSegmentGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrAccountSegmentGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrAccountSegmentObjectKeyData CASGetIn;
/**
 *
 * Constructor to create a  CsrAccountSegmentGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrAccountSegmentGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrAccountSegmentObjectKeyData CASGetInIn) {
    super(id, context, "CsrAccountSegmentGet");
    CASGetIn = CASGetInIn;
  }

  public void translateToMap() {
    if (CASGetIn != null) {
      CASGetIn.resetFlags(true, true);
      addInput("CsrAccountSegment", CsrAccountSegmentObjectKeyHelper.toMap(CASGetIn, new HashMap(), "CsrAccountSegmentObjectKeyData").get("CsrAccountSegmentObjectKeyData"));
    }
  }


/**
 *
 * Sets the CsrAccountSegment
 * @param CASGetInIn Value of the CASGetIn
 *
 */

  public void setCsrAccountSegment(CsrAccountSegmentObjectKeyData CASGetInIn) {
    CASGetIn = CASGetInIn;
  }

  public void translateFromMap() {
    CASGetIn = CsrAccountSegmentObjectKeyHelper.fromMap(inputMap, "CsrAccountSegment");
  }

/**
 *
 * Gets the CsrAccountSegment
 * @return Value of the CsrAccountSegment
 *
 */

  public CsrAccountSegmentObjectKeyData getCsrAccountSegment( ) {
    return CASGetIn;
  }

}
