/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StoredProcedureCallNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a StoredProcedureCallNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StoredProcedureCallNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected Map[] noOpIn;

/**
 *
 * Constructor to create a   StoredProcedureCallNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StoredProcedureCallNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, Map[] noOpInIn) {
    super(id, context, "StoredProcedureCall");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("StoredProcedureResult", noOpIn);
    }
  }
/**
 *
 * Sets the  StoredProcedureResult
 * @param noOpInIn Map[] to set
 *
 */
  public void setStoredProcedureResult(Map[] noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the StoredProcedureResult passed into the constructor
 * @return Simulated response
 *
 */
  public Map[] getStoredProcedureResult() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (Map[])inputMap.get("StoredProcedureResult");
  }
}
