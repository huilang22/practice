/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewDefGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a CcViewDefGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CcViewDefGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CcViewDefObjectKeyData CVDget_In;
/**
 *
 * Constructor to create a  CcViewDefGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CcViewDefGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CcViewDefObjectKeyData CVDget_InIn) {
    super(id, context, "CcViewDefGet");
    CVDget_In = CVDget_InIn;
  }

  public void translateToMap() {
    if (CVDget_In != null) {
      CVDget_In.resetFlags(true, true);
      addInput("CcViewDef", CcViewDefObjectKeyHelper.toMap(CVDget_In, new HashMap(), "CcViewDefObjectKeyData").get("CcViewDefObjectKeyData"));
    }
  }


/**
 *
 * Sets the CcViewDef
 * @param CVDget_InIn Value of the CVDget_In
 *
 */

  public void setCcViewDef(CcViewDefObjectKeyData CVDget_InIn) {
    CVDget_In = CVDget_InIn;
  }

  public void translateFromMap() {
    CVDget_In = CcViewDefObjectKeyHelper.fromMap(inputMap, "CcViewDef");
  }

/**
 *
 * Gets the CcViewDef
 * @return Value of the CcViewDef
 *
 */

  public CcViewDefObjectKeyData getCcViewDef( ) {
    return CVDget_In;
  }

}
