import React from 'react'
import Image from 'next/image'

const Nav = () => {
    return (
        <div class="container">
                <nav class="navbar navbar-expand-lg">
                    <div class="container-fluid">
                        <Image src="/aa-logo.png" alt="logo" width={300} height={50} />
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                            <div class="navbar-nav pt-3">
                                <a class="nav-link text-dark fw-bold ms-5 fs-6" href="#">PLAN TRAVEL</a>
                                <a class="nav-link text-dark fw-bold ms-5 fs-6" href="#">TRAVEL INFORMATION</a>
                                <a class="nav-link text-dark fw-bold ms-5 fs-6" >AADVANTAGE®</a>
                            </div>
                        </div>
                    </div>
                </nav>

        </div>
    )
}

export default Nav;
