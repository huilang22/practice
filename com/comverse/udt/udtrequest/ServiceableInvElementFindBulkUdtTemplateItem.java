/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableInvElementFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a ServiceableInvElementFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceableInvElementFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjFilter InvFndIn;
  protected BigInteger AddressIdIn;
/**
 *
 * Constructor to create a  ServiceableInvElementFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceableInvElementFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjFilter InvFndInIn, BigInteger AddressIdInIn) {
    super(id, context, "ServiceableInvElementFind");
    InvFndIn = InvFndInIn;
    AddressIdIn = AddressIdInIn;
  }

  public void translateToMap() {
    if (InvFndIn != null) {
      Integer index =  InvFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceableInvElement", InvElementObjHelper.toMap(InvFndIn, new HashMap(), "InvElement").get("InvElement"));
    }
    if (AddressIdIn != null) {
      addInput("AddressIdIn", AddressIdIn);
    }
  }


/**
 *
 * Sets the ServiceableInvElement
 * @param InvFndInIn Value of the InvFndIn
 *
 */

  public void setServiceableInvElement(InvElementObjFilter InvFndInIn) {
    InvFndIn = InvFndInIn;
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
    InvFndIn = InvElementObjHelper.fromMapFilter(inputMap, "ServiceableInvElement");
    AddressIdIn = (BigInteger)inputMap.get("AddressIdIn");
  }

/**
 *
 * Gets the ServiceableInvElement
 * @return Value of the ServiceableInvElement
 *
 */

  public InvElementObjFilter getServiceableInvElement( ) {
    return InvFndIn;
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
