/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContactCreateBulkUdtTemplateItem.java
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
 * Class used to create a ContactCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ContactCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContactObjectData ContactCreateIn;
/**
 *
 * Constructor to create a  ContactCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContactCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ContactObjectData ContactCreateInIn) {
    super(id, context, "ContactCreate");
    ContactCreateIn = ContactCreateInIn;
  }

  public void translateToMap() {
    if (ContactCreateIn != null) {
      ContactCreateIn.resetFlags(true, true);
      addInput("Contact", ContactObjectHelper.toMap(ContactCreateIn, new HashMap(), "Contact").get("Contact"));
    }
  }


/**
 *
 * Sets the Contact
 * @param ContactCreateInIn Value of the ContactCreateIn
 *
 */

  public void setContact(ContactObjectData ContactCreateInIn) {
    ContactCreateIn = ContactCreateInIn;
  }

  public void translateFromMap() {
    ContactCreateIn = ContactObjectHelper.fromMap(inputMap, "Contact");
  }

/**
 *
 * Gets the Contact
 * @return Value of the Contact
 *
 */

  public ContactObjectData getContact( ) {
    return ContactCreateIn;
  }

}
