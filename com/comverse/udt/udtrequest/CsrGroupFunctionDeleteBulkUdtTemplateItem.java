/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CsrGroupFunctionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrGroupFunctionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrGroupFunctionObjectKeyData GFDeleteIn;
/**
 *
 * Constructor to create a  CsrGroupFunctionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrGroupFunctionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupFunctionObjectKeyData GFDeleteInIn) {
    super(id, context, "CsrGroupFunctionDelete");
    GFDeleteIn = GFDeleteInIn;
  }

  public void translateToMap() {
    if (GFDeleteIn != null) {
      GFDeleteIn.resetFlags(true, true);
      addInput("CsrGroupFunction", CsrGroupFunctionObjectKeyHelper.toMap(GFDeleteIn, new HashMap(), "CsrGroupFunctionObjectKeyData").get("CsrGroupFunctionObjectKeyData"));
    }
  }


/**
 *
 * Sets the CsrGroupFunction
 * @param GFDeleteInIn Value of the GFDeleteIn
 *
 */

  public void setCsrGroupFunction(CsrGroupFunctionObjectKeyData GFDeleteInIn) {
    GFDeleteIn = GFDeleteInIn;
  }

  public void translateFromMap() {
    GFDeleteIn = CsrGroupFunctionObjectKeyHelper.fromMap(inputMap, "CsrGroupFunction");
  }

/**
 *
 * Gets the CsrGroupFunction
 * @return Value of the CsrGroupFunction
 *
 */

  public CsrGroupFunctionObjectKeyData getCsrGroupFunction( ) {
    return GFDeleteIn;
  }

}
