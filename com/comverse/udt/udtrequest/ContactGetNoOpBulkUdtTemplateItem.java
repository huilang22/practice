/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContactGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ContactGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ContactGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ContactObjectData noOpIn;

/**
 *
 * Constructor to create a   ContactGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ContactGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ContactObjectData noOpInIn) {
    super(id, context, "ContactGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Contact", ContactObjectHelper.toMap(noOpIn, new HashMap(), "Contact").get("Contact"));
    }
  }
/**
 *
 * Sets the  Contact
 * @param noOpInIn ContactObjectData to set
 *
 */
  public void setContact(ContactObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Contact passed into the constructor
 * @return Simulated response
 *
 */
  public ContactObjectData getContact() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ContactObjectHelper.fromMap(inputMap, "Contact");
  }
}
