/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a MasterAddressGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MasterAddressGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MasterAddressObjectData noOpIn;

/**
 *
 * Constructor to create a   MasterAddressGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MasterAddressGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MasterAddressObjectData noOpInIn) {
    super(id, context, "MasterAddressGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(noOpIn, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }
/**
 *
 * Sets the  MasterAddress
 * @param noOpInIn MasterAddressObjectData to set
 *
 */
  public void setMasterAddress(MasterAddressObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MasterAddress passed into the constructor
 * @return Simulated response
 *
 */
  public MasterAddressObjectData getMasterAddress() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MasterAddressObjectHelper.fromMap(inputMap, "MasterAddress");
  }
}
