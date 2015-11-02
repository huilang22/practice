/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StoredProcedureCallBulkUdtTemplateItem.java
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
 * Class used to create a StoredProcedureCallBulkUdtTemplateItem Bulk Template
 *
 */

public class StoredProcedureCallBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected StoredProcedureObjectData stored_procedure_call;
/**
 *
 * Constructor to create a  StoredProcedureCallBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public StoredProcedureCallBulkUdtTemplateItem(String id, BSDMSessionContext context, StoredProcedureObjectData stored_procedure_callIn) {
    super(id, context, "StoredProcedureCall");
    stored_procedure_call = stored_procedure_callIn;
  }

  public void translateToMap() {
    if (stored_procedure_call != null) {
      stored_procedure_call.resetFlags(true, true);
      addInput("StoredProcedureCall", StoredProcedureObjectHelper.toMap(stored_procedure_call, new HashMap(), "StoredProcedureResult").get("StoredProcedureResult"));
    }
  }


/**
 *
 * Sets the StoredProcedureCall
 * @param stored_procedure_callIn Value of the stored_procedure_call
 *
 */

  public void setStoredProcedureCall(StoredProcedureObjectData stored_procedure_callIn) {
    stored_procedure_call = stored_procedure_callIn;
  }

  public void translateFromMap() {
    stored_procedure_call = StoredProcedureObjectHelper.fromMap(inputMap, "StoredProcedureCall");
  }

/**
 *
 * Gets the StoredProcedureCall
 * @return Value of the StoredProcedureCall
 *
 */

  public StoredProcedureObjectData getStoredProcedureCall( ) {
    return stored_procedure_call;
  }

}
