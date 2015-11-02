/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorDeleteListBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a CorridorDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class CorridorDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CorridorObjectFilter CorridorDeleteListIn;
  protected Date InactiveDate;
/**
 *
 * Constructor to create a  CorridorDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CorridorDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, CorridorObjectFilter CorridorDeleteListInIn, Date InactiveDateIn) {
    super(id, context, "CorridorDeleteList");
    CorridorDeleteListIn = CorridorDeleteListInIn;
    InactiveDate = InactiveDateIn;
  }

  public void translateToMap() {
    if (CorridorDeleteListIn != null) {
      Integer index =  CorridorDeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Corridor", CorridorObjectHelper.toMap(CorridorDeleteListIn, new HashMap(), "Corridor").get("Corridor"));
    }
    if (InactiveDate != null) {
      addInput("InactiveDate", InactiveDate);
    }
  }


/**
 *
 * Sets the Corridor
 * @param CorridorDeleteListInIn Value of the CorridorDeleteListIn
 *
 */

  public void setCorridor(CorridorObjectFilter CorridorDeleteListInIn) {
    CorridorDeleteListIn = CorridorDeleteListInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param InactiveDateIn Value of the InactiveDate
 *
 */

  public void setInactiveDate(Date InactiveDateIn) {
    InactiveDate = InactiveDateIn;
  }

  public void translateFromMap() {
    CorridorDeleteListIn = CorridorObjectHelper.fromMapFilter(inputMap, "Corridor");
    InactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the Corridor
 * @return Value of the Corridor
 *
 */

  public CorridorObjectFilter getCorridor( ) {
    return CorridorDeleteListIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return InactiveDate;
  }

}
