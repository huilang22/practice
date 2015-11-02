/*
 * Generated code DO NOT EDIT
 * Generated file: ServInvElementFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;
import com.csgsystems.svbl.data.*;

/**
 *
 * Class used to create a ServInvElementFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServInvElementFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvElementFindIn;
  protected BigInteger AddressIdIn;
/**
 *
 * Constructor to create a  ServInvElementFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServInvElementFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvElementFindInIn, BigInteger AddressIdInIn) {
    super(id, context, "ServInvElementFind");
    InvElementFindIn = InvElementFindInIn;
    AddressIdIn = AddressIdInIn;
  }

  public void translateToMap() {
    if (InvElementFindIn != null) {
      InvElementFindIn.resetFlags(true, true);
      addInput("ServInvElement", InvElementObjHelper.toMap(InvElementFindIn, new HashMap(), "InvElement").get("InvElement"));
    }
    if (AddressIdIn != null) {
      addInput("AddressIdIn", AddressIdIn);
    }
  }


/**
 *
 * Sets the ServInvElement
 * @param InvElementFindInIn Value of the InvElementFindIn
 *
 */

  public void setServInvElement(InvElementObjData InvElementFindInIn) {
    InvElementFindIn = InvElementFindInIn;
  }

/**
 *
 * Sets the AddressIdIn
 * @param AddressIdInIn Value of the AddressIdIn
 *
 */

  public void setAddressIdIn(BigInteger AddressIdInIn) {
    AddressIdIn = AddressIdInIn;
  }

  public void translateFromMap() {
    InvElementFindIn = InvElementObjHelper.fromMap(inputMap, "ServInvElement");
    AddressIdIn = (BigInteger)inputMap.get("AddressIdIn");
  }

/**
 *
 * Gets the ServInvElement
 * @return Value of the ServInvElement
 *
 */

  public InvElementObjData getServInvElement( ) {
    return InvElementFindIn;
  }

/**
 *
 * Gets the AddressIdIn
 * @return Value of the AddressIdIn
 *
 */

  public BigInteger getAddressIdIn( ) {
    return AddressIdIn;
  }

}
