/*
 * Generated code DO NOT EDIT
 * Generated file: AtmPoplistCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a AtmPoplistCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AtmPoplistCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AtmPoplistObjectData atmCrIn;
/**
 *
 * Constructor to create a  AtmPoplistCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AtmPoplistCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AtmPoplistObjectData atmCrInIn) {
    super(id, context, "AtmPoplistCreate");
    atmCrIn = atmCrInIn;
  }

  public void translateToMap() {
    if (atmCrIn != null) {
      atmCrIn.resetFlags(true, true);
      addInput("AtmPoplist", AtmPoplistObjectHelper.toMap(atmCrIn, new HashMap(), "AtmPoplist").get("AtmPoplist"));
    }
  }


/**
 *
 * Sets the AtmPoplist
 * @param atmCrInIn Value of the atmCrIn
 *
 */

  public void setAtmPoplist(AtmPoplistObjectData atmCrInIn) {
    atmCrIn = atmCrInIn;
  }

  public void translateFromMap() {
    atmCrIn = AtmPoplistObjectHelper.fromMap(inputMap, "AtmPoplist");
  }

/**
 *
 * Gets the AtmPoplist
 * @return Value of the AtmPoplist
 *
 */

  public AtmPoplistObjectData getAtmPoplist( ) {
    return atmCrIn;
  }

}
