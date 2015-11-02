/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CsrGroupFunctionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrGroupFunctionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrGroupFunctionObjectData GFUpdateIn;
/**
 *
 * Constructor to create a  CsrGroupFunctionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrGroupFunctionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupFunctionObjectData GFUpdateInIn) {
    super(id, context, "CsrGroupFunctionUpdate");
    GFUpdateIn = GFUpdateInIn;
  }

  public void translateToMap() {
    if (GFUpdateIn != null) {
      GFUpdateIn.resetFlags(true, true);
      addInput("CsrGroupFunction", CsrGroupFunctionObjectHelper.toMap(GFUpdateIn, new HashMap(), "CsrGroupFunction").get("CsrGroupFunction"));
    }
  }


/**
 *
 * Sets the CsrGroupFunction
 * @param GFUpdateInIn Value of the GFUpdateIn
 *
 */

  public void setCsrGroupFunction(CsrGroupFunctionObjectData GFUpdateInIn) {
    GFUpdateIn = GFUpdateInIn;
  }

  public void translateFromMap() {
    GFUpdateIn = CsrGroupFunctionObjectHelper.fromMap(inputMap, "CsrGroupFunction");
  }

/**
 *
 * Gets the CsrGroupFunction
 * @return Value of the CsrGroupFunction
 *
 */

  public CsrGroupFunctionObjectData getCsrGroupFunction( ) {
    return GFUpdateIn;
  }

}
