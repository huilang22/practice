/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionFindBulkUdtTemplateItem.java
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
 * Class used to create a CsrGroupFunctionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrGroupFunctionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrGroupFunctionObjectFilter GFFindIn;
/**
 *
 * Constructor to create a  CsrGroupFunctionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrGroupFunctionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrGroupFunctionObjectFilter GFFindInIn) {
    super(id, context, "CsrGroupFunctionFind");
    GFFindIn = GFFindInIn;
  }

  public void translateToMap() {
    if (GFFindIn != null) {
      Integer index =  GFFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CsrGroupFunction", CsrGroupFunctionObjectHelper.toMap(GFFindIn, new HashMap(), "CsrGroupFunction").get("CsrGroupFunction"));
    }
  }


/**
 *
 * Sets the CsrGroupFunction
 * @param GFFindInIn Value of the GFFindIn
 *
 */

  public void setCsrGroupFunction(CsrGroupFunctionObjectFilter GFFindInIn) {
    GFFindIn = GFFindInIn;
  }

  public void translateFromMap() {
    GFFindIn = CsrGroupFunctionObjectHelper.fromMapFilter(inputMap, "CsrGroupFunction");
  }

/**
 *
 * Gets the CsrGroupFunction
 * @return Value of the CsrGroupFunction
 *
 */

  public CsrGroupFunctionObjectFilter getCsrGroupFunction( ) {
    return GFFindIn;
  }

}
