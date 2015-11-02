/*
 * Generated code DO NOT EDIT
 * Generated file: MasterAddressCreateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a MasterAddressCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class MasterAddressCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MasterAddressObjectData MasterAddressCreateIn;
/**
 *
 * Constructor to create a  MasterAddressCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MasterAddressCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, MasterAddressObjectData MasterAddressCreateInIn) {
    super(id, context, "MasterAddressCreate");
    MasterAddressCreateIn = MasterAddressCreateInIn;
  }

  public void translateToMap() {
    if (MasterAddressCreateIn != null) {
      MasterAddressCreateIn.resetFlags(true, true);
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(MasterAddressCreateIn, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }


/**
 *
 * Sets the MasterAddress
 * @param MasterAddressCreateInIn Value of the MasterAddressCreateIn
 *
 */

  public void setMasterAddress(MasterAddressObjectData MasterAddressCreateInIn) {
    MasterAddressCreateIn = MasterAddressCreateInIn;
  }

  public void translateFromMap() {
    MasterAddressCreateIn = MasterAddressObjectHelper.fromMap(inputMap, "MasterAddress");
  }

/**
 *
 * Gets the MasterAddress
 * @return Value of the MasterAddress
 *
 */

  public MasterAddressObjectData getMasterAddress( ) {
    return MasterAddressCreateIn;
  }

}
