/*
 * Generated code DO NOT EDIT
 * Generated file: EpiFindBulkUdtTemplateItem.java
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
 * Class used to create a EpiFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EpiFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EpiObjectFilter EpiFindIn;
/**
 *
 * Constructor to create a  EpiFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EpiFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiObjectFilter EpiFindInIn) {
    super(id, context, "EpiFind");
    EpiFindIn = EpiFindInIn;
  }

  public void translateToMap() {
    if (EpiFindIn != null) {
      Integer index =  EpiFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Epi", EpiObjectHelper.toMap(EpiFindIn, new HashMap(), "Epi").get("Epi"));
    }
  }


/**
 *
 * Sets the Epi
 * @param EpiFindInIn Value of the EpiFindIn
 *
 */

  public void setEpi(EpiObjectFilter EpiFindInIn) {
    EpiFindIn = EpiFindInIn;
  }

  public void translateFromMap() {
    EpiFindIn = EpiObjectHelper.fromMapFilter(inputMap, "Epi");
  }

/**
 *
 * Gets the Epi
 * @return Value of the Epi
 *
 */

  public EpiObjectFilter getEpi( ) {
    return EpiFindIn;
  }

}
