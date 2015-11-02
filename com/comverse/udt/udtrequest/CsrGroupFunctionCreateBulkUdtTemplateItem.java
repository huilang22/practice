/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionCreateBulkUdtTemplateItem.java
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
 * Class used to create a CsrGroupFunctionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrGroupFunctionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrGroupFunctionObjectData GFCreateIn;
/**
 *
 * Constructor to create a  CsrGroupFunctionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrGroupFunctionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupFunctionObjectData GFCreateInIn) {
    super(id, context, "CsrGroupFunctionCreate");
    GFCreateIn = GFCreateInIn;
  }

  public void translateToMap() {
    if (GFCreateIn != null) {
      GFCreateIn.resetFlags(true, true);
      addInput("CsrGroupFunction", CsrGroupFunctionObjectHelper.toMap(GFCreateIn, new HashMap(), "CsrGroupFunction").get("CsrGroupFunction"));
    }
  }


/**
 *
 * Sets the CsrGroupFunction
 * @param GFCreateInIn Value of the GFCreateIn
 *
 */

  public void setCsrGroupFunction(CsrGroupFunctionObjectData GFCreateInIn) {
    GFCreateIn = GFCreateInIn;
  }

  public void translateFromMap() {
    GFCreateIn = CsrGroupFunctionObjectHelper.fromMap(inputMap, "CsrGroupFunction");
  }

/**
 *
 * Gets the CsrGroupFunction
 * @return Value of the CsrGroupFunction
 *
 */

  public CsrGroupFunctionObjectData getCsrGroupFunction( ) {
    return GFCreateIn;
  }

}
