/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionGetBulkUdtTemplateItem.java
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
 * Class used to create a CsrGroupFunctionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrGroupFunctionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrGroupFunctionObjectKeyData GFGetIn;
/**
 *
 * Constructor to create a  CsrGroupFunctionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrGroupFunctionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupFunctionObjectKeyData GFGetInIn) {
    super(id, context, "CsrGroupFunctionGet");
    GFGetIn = GFGetInIn;
  }

  public void translateToMap() {
    if (GFGetIn != null) {
      GFGetIn.resetFlags(true, true);
      addInput("CsrGroupFunction", CsrGroupFunctionObjectKeyHelper.toMap(GFGetIn, new HashMap(), "CsrGroupFunctionObjectKeyData").get("CsrGroupFunctionObjectKeyData"));
    }
  }


/**
 *
 * Sets the CsrGroupFunction
 * @param GFGetInIn Value of the GFGetIn
 *
 */

  public void setCsrGroupFunction(CsrGroupFunctionObjectKeyData GFGetInIn) {
    GFGetIn = GFGetInIn;
  }

  public void translateFromMap() {
    GFGetIn = CsrGroupFunctionObjectKeyHelper.fromMap(inputMap, "CsrGroupFunction");
  }

/**
 *
 * Gets the CsrGroupFunction
 * @return Value of the CsrGroupFunction
 *
 */

  public CsrGroupFunctionObjectKeyData getCsrGroupFunction( ) {
    return GFGetIn;
  }

}
