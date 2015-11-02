/*
 * Generated code DO NOT EDIT
 * Generated file: AtmPoplistFindBulkUdtTemplateItem.java
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
 * Class used to create a AtmPoplistFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AtmPoplistFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AtmPoplistObjectFilter atmFindIn;
/**
 *
 * Constructor to create a  AtmPoplistFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AtmPoplistFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AtmPoplistObjectFilter atmFindInIn) {
    super(id, context, "AtmPoplistFind");
    atmFindIn = atmFindInIn;
  }

  public void translateToMap() {
    if (atmFindIn != null) {
      Integer index =  atmFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AtmPoplist", AtmPoplistObjectHelper.toMap(atmFindIn, new HashMap(), "AtmPoplist").get("AtmPoplist"));
    }
  }


/**
 *
 * Sets the AtmPoplist
 * @param atmFindInIn Value of the atmFindIn
 *
 */

  public void setAtmPoplist(AtmPoplistObjectFilter atmFindInIn) {
    atmFindIn = atmFindInIn;
  }

  public void translateFromMap() {
    atmFindIn = AtmPoplistObjectHelper.fromMapFilter(inputMap, "AtmPoplist");
  }

/**
 *
 * Gets the AtmPoplist
 * @return Value of the AtmPoplist
 *
 */

  public AtmPoplistObjectFilter getAtmPoplist( ) {
    return atmFindIn;
  }

}
