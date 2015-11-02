/*
 * Generated code DO NOT EDIT
 * Generated file: AtmPoplistUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AtmPoplistUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AtmPoplistUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AtmPoplistObjectData atmUpdIn;
/**
 *
 * Constructor to create a  AtmPoplistUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AtmPoplistUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AtmPoplistObjectData atmUpdInIn) {
    super(id, context, "AtmPoplistUpdate");
    atmUpdIn = atmUpdInIn;
  }

  public void translateToMap() {
    if (atmUpdIn != null) {
      atmUpdIn.resetFlags(true, true);
      addInput("AtmPoplist", AtmPoplistObjectHelper.toMap(atmUpdIn, new HashMap(), "AtmPoplist").get("AtmPoplist"));
    }
  }


/**
 *
 * Sets the AtmPoplist
 * @param atmUpdInIn Value of the atmUpdIn
 *
 */

  public void setAtmPoplist(AtmPoplistObjectData atmUpdInIn) {
    atmUpdIn = atmUpdInIn;
  }

  public void translateFromMap() {
    atmUpdIn = AtmPoplistObjectHelper.fromMap(inputMap, "AtmPoplist");
  }

/**
 *
 * Gets the AtmPoplist
 * @return Value of the AtmPoplist
 *
 */

  public AtmPoplistObjectData getAtmPoplist( ) {
    return atmUpdIn;
  }

}
